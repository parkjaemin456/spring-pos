package itc.hoseo.pos;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ItemTests {

    @Test
    void test_감자() {
        Item i= Item.builder()
                .name("감자")
                .build();

        assertEquals("감자",i.getName());
        assertEquals(null,i.getItem());
    }

}
