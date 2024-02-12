package com.choru.analyst.domain.member.repository;

import com.choru.analyst.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
