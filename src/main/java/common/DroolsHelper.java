package common;

import org.drools.compiler.builder.impl.KnowledgeBuilderImpl;
import org.drools.compiler.kproject.ReleaseIdImpl;
import org.drools.core.RuleBaseConfiguration;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class DroolsHelper {
    public static void execute(String rules, String input) throws IOException, URISyntaxException {
        execute(Objects.requireNonNull(DroolsHelper.class.getResource(rules)), DroolsHelper.class.getResource(input));
    }

    public static void execute(URL rules, URL input) throws IOException, URISyntaxException {
        var kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        try (var rulesStream = rules.openStream();
             var inputStream = DroolsHelper.class.getResourceAsStream("/input.drl")
        ) {
            kBuilder.add(ResourceFactory.newInputStreamResource(inputStream), ResourceType.DRL);
            kBuilder.add(ResourceFactory.newInputStreamResource(rulesStream), ResourceType.DRL);
        }
        RuleBaseConfiguration conf = new RuleBaseConfiguration();
        conf.setOption(EqualityBehaviorOption.EQUALITY);
        KieBase kieBase = ((KnowledgeBuilderImpl)kBuilder).newKnowledgeBase(conf);
        kieBase.newStatelessKieSession().execute(new Input(Files.readString(Path.of(input.toURI()))));
    }
}
