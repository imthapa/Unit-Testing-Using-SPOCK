import spock.lang.IgnoreRest
import spock.lang.Specification

import java.nio.file.FileAlreadyExistsException

/**
 * Created by ishwar on 21/3/17.
 */
class Tester2 extends Specification{

    Question2 question2;
    def setup(){
        question2 = new Question2();

    }

    def "fileCopySadTest"(){

        when:
        question2.copyFile(System.getProperty("user.dir") + "/src/test2.txt",
                System.getProperty("user.dir") + "/src/copy.txt");
        then:
        thrown(FileNotFoundException);
    }
//    //uncomment this by deleting test.txt file
//    def "fileCopyHappyTest"(){
//
//        when:
//        boolean flag = question2.copyFile(System.getProperty("user.dir") + "/src/test.txt",
//                System.getProperty("user.dir") + "/src/copy.txt");
//        then:
//        flag == true
//    }

    def "fileAlreadyCopyHappyTest"(){

        when:
        boolean flag = question2.copyFile(System.getProperty("user.dir") + "/src/test.txt",
                System.getProperty("user.dir") + "/src/copy.txt");
        then:
        thrown(FileAlreadyExistsException);
       // flag == false
    }

}
