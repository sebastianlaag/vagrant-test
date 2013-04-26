package de.laag.de.laag.vagrant;

import java.io.File;
import java.io.IOException;

import com.guigarage.vagrant.Vagrant;
import com.guigarage.vagrant.configuration.VagrantEnvironmentConfig;
import com.guigarage.vagrant.configuration.VagrantVmConfig;
import com.guigarage.vagrant.configuration.builder.VagrantEnvironmentConfigBuilder;
import com.guigarage.vagrant.configuration.builder.VagrantVmConfigBuilder;
import com.guigarage.vagrant.model.VagrantEnvironment;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		VagrantVmConfig vmConfig = VagrantVmConfigBuilder.create()
				.withName("lucid32").withBoxName("lucid32").build();

		VagrantEnvironmentConfig environmentConfig = VagrantEnvironmentConfigBuilder
				.create().withVagrantVmConfig(vmConfig).build();

		Vagrant vagrant = new Vagrant(true);

		VagrantEnvironment environment = vagrant.createEnvironment(new File(
				"tmp"), environmentConfig);

		environment.up();
	}
}
