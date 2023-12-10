package com.mahidhar.SpringFrame2Anno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor{
public void process() {
	System.out.println("scenodhary processor in WIRLD");
}
}
