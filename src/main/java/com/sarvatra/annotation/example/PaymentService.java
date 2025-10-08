// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.sarvatra.annotation.example;

import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

@ServiceInfo(author = "Tejas", version = "1.0")
public class PaymentService {
    private static final Logger logger = getLogger(PaymentService.class);

    public static void main(String[] args) {
        Class<?> classZ = PaymentService.class;
        if (classZ.isAnnotationPresent(ServiceInfo.class)) {
            ServiceInfo info = classZ.getAnnotation(ServiceInfo.class);
            logger.info("{} -> Author :- {}, Version :- {}",classZ.getSimpleName(), info.author(), info.version());
        }
    }

}

// 21:19:54.604 [main] INFO com.sarvatra.annotation.example.PaymentService -- PaymentService -> Author :- Tejas, Version :- 1.0

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------