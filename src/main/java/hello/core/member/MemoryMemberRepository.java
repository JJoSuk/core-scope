package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    // 저장소
    private static Map<Long, Member> store = new HashMap<>();

    // 저장할 소스
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    // 아이디 찾기
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
