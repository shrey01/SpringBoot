package com.clovity.examples.drools.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfiguration {

	private final KieServices kieServices = KieServices.Factory.get();

	@Bean
	public KieContainer kieContainer() {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(ResourceFactory.newClassPathResource("rule.drl"));
		SpreadsheetCompiler compiler = new SpreadsheetCompiler();
		try {
			String bigDrl = compiler.compile(new FileInputStream("C:\\CodeBank\\DT\\drools-demo\\src\\main\\resources\\rules.xls"), InputType.XLS);
		System.out.println(bigDrl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		return kieServices.newKieContainer(kieModule.getReleaseId());
	}
}