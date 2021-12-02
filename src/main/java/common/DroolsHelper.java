package common;

import org.kie.api.io.ResourceType;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class DroolsHelper {
    public static void execute(String rules, String input) throws IOException, URISyntaxException {
        execute(DroolsHelper.class.getResource(rules), DroolsHelper.class.getResource(input));
    }

    public static void execute(URL rules, URL input) throws IOException, URISyntaxException {
        var kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        try (var rulesStream = rules.openStream();
             var inputStream = DroolsHelper.class.getResourceAsStream("/input.drl")
        ) {
            kBuilder.add(ResourceFactory.newInputStreamResource(inputStream), ResourceType.DRL);
            kBuilder.add(ResourceFactory.newInputStreamResource(rulesStream), ResourceType.DRL);
        }
        kBuilder.newKieBase().newStatelessKieSession().execute(new Input(Files.readString(Path.of(input.toURI()))));
    }
}
