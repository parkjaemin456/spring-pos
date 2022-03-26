package itc.hoseo.pos.repository.impl;

import itc.hoseo.pos.domain.Member;
import itc.hoseo.pos.repository.ItemRepository;
import itc.hoseo.pos.repository.MemberRepository;
import lombok.Singular;

import java.util.*;


public class HashMapMemberRepository implements MemberRepository {
    public static final HashMapMemberRepository instance = new HashMapMemberRepository();

    public static HashMapMemberRepository getInstance(){
        return instance;
    }

    public Map<Integer,Member> map = new HashMap<>();

    @Override
    public Optional<Member> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Member> findByName(String name) {
        //반환리스트 생성
        List<Member> list = new ArrayList<>();
        //맵전체에서 K,V 모든 맴버를가져옴
        for(Member m : map.values()){
            //이름이 넘어온 파라미터와 일치하면? 리스트에 추가
            if(name.equals(m.getName())){
                list.add(m);
            }
        }
        //리스트 반환
        return list;
    }

    @Override
    public void save(Member member) {
        map.put(member.getSeq(),member);
    }

    @Override
    public List<Member> allMemeber() {
        return null;
    }
}