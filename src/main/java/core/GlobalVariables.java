package core;

import untils.RandomUtils;

public class GlobalVariables {
    private GlobalVariables() {
        throw new IllegalStateException("Constant class");
    }

    //common
    public static final String URL = "http://live.techpanda.org/";
    public static final String DISCOUNT_CODE = "GURU50 ";

    // register page
    public static final String FIRST_NAME = "Automation";
    public static final String LAST_NAME = "FC";
    public static final String PASS_WORD = "123123";
    public static final String EMAIL_ADDRESS = RandomUtils.generateRandomEmail();
}
