package TodoListTest;

import com.Todo_App.Africa.Data.IdGenerator;
import com.Todo_App.Africa.UserDetails.User;
import com.Todo_App.Africa.Writingboard.WritingBoard;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TodoListTest {

        User user;
        WritingBoard writingBoard;
        IdGenerator idGenerator;
        IdGenerator idGenerator2;
        IdGenerator idGenerator3;
        IdGenerator idGenerator4;
        IdGenerator idGenerator5;
        @BeforeEach
        void setUp() {
           user =new User();
           writingBoard=new WritingBoard();
           idGenerator=new IdGenerator();
           idGenerator2=new IdGenerator();
           idGenerator3=new IdGenerator();
           idGenerator4=new IdGenerator();
           idGenerator5=new IdGenerator();
        }
        @AfterEach
        void tearDown() {

        }
        @Test
    void testThatUserExist(){
            assertNotNull(user);
        }
    @Test
    void testThatUserCanWriteOnABoardAndTheBoardCanDisplay(){
            String  words="I love you so much";
            String  words1="I love you so much1";
            String  words2="I love you so much2";
        writingBoard.getTodoList().add(words);
        writingBoard.getTodoList().add(words1);
        writingBoard.getTodoList().add(words2);
        writingBoard.displayTodoList();
        assertEquals(3,writingBoard.getTodoList().size());
    }
@Test
    void testTheIdGeneratorBankExist(){
        assertNotNull(idGenerator);
}

  @Test
  void testThatIdGeneratorBankCanGenerateId(){

      
      assertEquals(1,idGenerator.getId());
      assertEquals(2,idGenerator2.getId());
      assertEquals(3,idGenerator3.getId());
      assertEquals(4,idGenerator4.getId());
      assertEquals(5,idGenerator5.getId());
  }

    }


