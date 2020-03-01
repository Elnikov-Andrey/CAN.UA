package tests;

import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void start() {
        //Selenide.open("http://olx.ua");
    }

    @AfterAll
    static void end(){
    }
}
