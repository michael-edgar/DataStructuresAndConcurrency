package spelling;

        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class AVLTreeTest {

    AVLTree<String> Test;

    @BeforeEach
    void Start()
    {
        Test = new AVLTree<String>();
        Test.add("Adapt");
        Test.add("Engine");
        Test.add("Vision");
        Test.add("Fire");
    }


    @Test
    void containsIterativeTrue() {
        assertTrue(Test.containsIterative("Adapt"));
    }

    @Test
    void containsIterativeTrue2() {
        assertTrue(Test.containsIterative("Engine"));
    }

    @Test
    void containsIterativeTrue3() {
        assertTrue(Test.containsIterative("Vision"));
    }

    @Test
    void containsIterativeTrue4() {
        assertTrue(Test.containsIterative("Fire"));
    }

    @Test
    void containsIterativeFalse() {
        assertFalse(Test.containsIterative("Clean"));
    }
}