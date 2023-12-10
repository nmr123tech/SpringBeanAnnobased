package com.mahidhar.SpringFrame2Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Samsung {
	
	@Autowired
	@Qualifier("snapdrago") // when there are two classes single interface use Qualifier & Primary
	MobileProcessor cpu; 
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa core 4gb RAM , 12 MP Camera");
		cpu.process();
	}

}
