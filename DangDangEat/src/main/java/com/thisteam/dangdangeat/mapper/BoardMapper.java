package com.thisteam.dangdangeat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.thisteam.dangdangeat.vo.NoticeVO;
import com.thisteam.dangdangeat.vo.Order_product_review_viewVO;
import com.thisteam.dangdangeat.vo.QnaVO;
import com.thisteam.dangdangeat.vo.ReviewVO;

public interface BoardMapper {
	
	// ======================== sangwoo 시작 ==================================
	List<NoticeVO> getNoticeList(@Param("keyword") String keyword, 
								@Param("pageNum") int pageNum, 
								@Param("startRow") int startRow, 
								@Param("listLimit") int listLimit);

	int getNoticeListCount(@Param("keyword") String keyword);

	int insertNotice(NoticeVO notice);

	NoticeVO getDetailList(@Param("code") int notice_code);

	int modifyNotice(NoticeVO notice);

	int deleteNotice(@Param("code") int notice_code);

	List<QnaVO> getQnaList(@Param("keyword") String keyword, 
							@Param("pageNum") int pageNum, 
							@Param("startRow") int startRow, 
							@Param("listLimit") int listLimit);
	
	int getQnaListCount(String keyword);
	
	QnaVO getQnaDetaiList(@Param("code") int qna_code);
	
	int insertQna(QnaVO qna);
	// ======================== sangwoo 끝 ==================================

	// ======================== jakyoung 시작 ===================================
	
	// 해당 상품 리뷰 목록 가져오기
	List<ReviewVO> selectReviewList(
			@Param("pro_code") int pro_code
			, @Param("keyword") String keyword
			, @Param("startRow") int startRow
			, @Param("listLimit") int listLimit);

	// 해당 상품 리뷰 개수
	int selectReviewListCount(
			@Param("pro_code") int pro_code
			, @Param("keyword") String keyword);

	// 상품 리뷰 등록
	int insertReview(ReviewVO review);

	// 주문 상품 리뷰 작성 여부 확인
	List<Order_product_review_viewVO> selectOrderProductReview(
			@Param("member_id") String member_id
			, @Param("pro_code") int pro_code);

	// 주문 상품 리뷰 작성 상태 수정
	int updateReviewStatus(
			@Param("review") ReviewVO review
			, @Param("oprView") Order_product_review_viewVO oprView);

	
	// ======================== jakyoung 끝 ===================================

}













