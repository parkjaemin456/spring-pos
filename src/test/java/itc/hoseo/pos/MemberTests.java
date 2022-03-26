package itc.hoseo.pos;

import itc.hoseo.pos.domain.Member;
import itc.hoseo.pos.repository.MemberRepository;
import itc.hoseo.pos.repository.impl.HashMapMemberRepository;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.StructMemberHelper;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MemberTests {

    @Test
    void test_김봉남() {
        //Builder
        Member m2= Member.builder()
                .name("김봉남")
                .build();

        assertEquals("김봉남",m2.getName());
        assertEquals(null,m2.getAge());
    }
    @Test
    void testMemberRepository(){
        MemberRepository repository = HashMapMemberRepository.getInstance();
        repository.save(new Member(1,"a","a","a",2));
        repository.save(new Member(2,"a","a","a",2));
        repository.save(new Member(3,"a","a","a",2));

        assertEquals(3,repository.allMemeber().size());

    }

}
