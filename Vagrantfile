# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant::Config.run do |config|
	
	config.vm.define :lucid32 do |lucid32_config|
		# Several network modes
		#lucid32_config.vm.network :hostonly, "192.168.1.10"
		#lucid32_config.vm.network :bridged
		
		# Declare if vm boots in gui or headless mode
		#lucid32_config.vm.boot_mode = :gui
		
		# Name of the vagrant box
		lucid32_config.vm.box = "lucid32"
		# If box can not be imported, download it at this URL
		lucid32_config.vm.box_url="http://files.vagrantup.com/lucid32.box"
		
		# Declare ssh port of box
		#lucid32_config.ssh.port = 22
		
		# Port forwarding
		lucid32_config.vm.forward_port 8181, 18181
		lucid32_config.vm.forward_port 8080, 18080
		lucid32_config.vm.forward_port 9090, 19090
		# Number of retries for connection to ssh port
		lucid32_config.ssh.max_tries = 150
		
		lucid32_config.vm.provision :chef_solo do |chef|
			#chef.recipe_url = "http://files.vagrantup.com/getting_started/cookbooks.tar.gz"
			chef.cookbooks_path = ["cookbooks"]
			chef.roles_path = ["roles"]
			chef.add_role("tomcatserver")
		end
	end
	
	config.vm.define :lucid64 do |lucid64_config|
		lucid64_config.vm.box_url="http://files.vagrantup.com/lucid64.box"
		lucid64_config.vm.box = "lucid64"
		lucid64_config.vm.provision :chef_solo do |chef|
			chef.cookbooks_path = ["cookbooks"]
			chef.roles_path = ["roles"]
			chef.add_role("tomcatserver")
		end
	end

end