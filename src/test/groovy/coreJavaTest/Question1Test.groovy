package coreJavaTest

import coreJavaTesting.Question1
import spock.lang.IgnoreRest
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by ishwar on 21/3/17.
 */
class Question1Test extends Specification {
    Question1 question1;

    def setup() {
        question1 = new Question1();
    }

    @Unroll
    def "HappyTest"() {

        expect:
        question1.stringReplacer(source, old, replacer) == expectedResult;

        where:
        source             | old     | replacer | expectedResult
        "ishwar@gmail.com" | ".com"  | ".in"    | true
        "To The New"       | "New"   | "World"  | true
        "To The New"       | "World" | "New"    | false
        ""                 | ""      | "a"      | true
    }


    def "FailTest"() {
        given:
        String source = "ishwar@gmail.com";
        String old = "hotmail.com";
        String replacer = "tothenew.com";

        expect:
        question1.stringReplacer(source, old, replacer) == false;
    }
}
