package com.thisteam.dangdangeat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.thisteam.dangdangeat.vo.AdminOrderListVO;
import com.thisteam.dangdangeat.vo.CouponVO;
import com.thisteam.dangdangeat.vo.Coupon_viewVO;
import com.thisteam.dangdangeat.vo.MemberVO;
import com.thisteam.dangdangeat.vo.QnaVO;
import com.thisteam.dangdangeat.vo.ReviewVO;
import com.thisteam.dangdangeat.vo.WishlistVO;

public interface AdminMapper {

	// 회원 목록 조회
	List<MemberVO> selectMemberList();

	// 회원 정보 수정
	int updateMember(MemberVO member);

	// 회원 삭제
	int deleteMember(MemberVO member);
	
	// 리뷰 삭제
	int deleteReview(ReviewVO review);
	
	// ============================================== yeram ================================================
	// Wish Top
	List<WishlistVO> selectWishlistTop();

	// 한 달 가입 수
	int selectMemberMonthlyJoin();

	// 한 달 매출액
	int selectSalesTotalMonthly();

	// 한 달 주문 건 수
	int selectOrderMonthly();

	// 한 달 리뷰 수
	int selectReviewCountMonthly();
	
	// ============================================== yeram ================================================

	//=========================== hawon 시작=====================================
	//쿠폰 수정
	int updateCoupon(@Param("coupon") Coupon_viewVO coupon);
	
	//쿠폰 한개에 대한 정보 가져오기
	Coupon_viewVO selectCoupon(String cp_code);
	
	//쿠폰 등록
	int insertCoupon(@Param("coupon") CouponVO coupon);

	//존재하는 쿠폰 코드인지 확인
	String isExistCode(@Param("cp_code")String coupon_code);
	
	//쿠폰 삭제
	int deleteCoupon(String cp_code);

	//회원들에게 생일쿠폰 발급
	int insertBirthCouponToMc(@Param("cp_code") String cp_code);

	//회원가입시 쿠폰 등록
	int insertAutoCouponForNewMem(String member_id);
	
	
//=========================== hawon 끝 =====================================

//============================ admin/orderList 미주 ===========================================
	
	// 관리자 - 주문 관리 페이지
	List<AdminOrderListVO> selectOrderList();


  
//============================ admin/orderList 미주 ===========================================

//============================ admin/boardQnaList sangwoo =====================================

	// 관리자 페이지 qna 리스트
	List<QnaVO> selectQnaList();
	
//============================ admin/boardQnaList sangwoo =====================================
}














