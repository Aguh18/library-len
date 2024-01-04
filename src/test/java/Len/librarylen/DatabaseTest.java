package Len.librarylen;

import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    void testsingleton() {
        Database database = Database.getInstance();
        Database database2 = Database.getInstance();

        assert(database == database2);
     
    }
}
