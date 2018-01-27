package contracts.base;

import org.junit.Before;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;

public class Base implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        System.out.println("all test init");
        return base;
    }
}

