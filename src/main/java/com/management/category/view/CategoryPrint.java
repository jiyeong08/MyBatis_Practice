package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // * 주석을 지우고 다음 세 가지 메소드를 작성하세요.

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        // 1. 조회한 목록 출력하는 메소드
        //    (조건 1) HashMap 타입의 매개변수로 받아온 값을 기준으로 전체 목록 조회인지, 순위별 제품분류 조회인지 구분하여 출력하세요.
        //    (조건 2) List<CategoryDTO>로 받아온 데이터 목록을 전체 출력하세요.
        if("orderList".equals(parameter.get("option"))){
            System.out.println("====순위별 제품분류 목록====");
        }else {
            System.out.println("====전체 제품분류 목록====");
        }
        for(CategoryDTO category : categoryList){
            System.out.println(category);
        }
        System.out.println("========");

    }

    public void printSuccessMessage(String successCode) {

        // 2. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 각각의 요청에 대해 성공을 알리는 메시지를 출력하세요.
        String successMessage = "";
        switch (successCode){
            case "registCategory": successMessage = "신규 제품분류를 등록했습니다"; break;
            case "modifyCategory": successMessage = "제품분류명을 정상적으로 변경했습니다"; break;
            case "deleteCategory": successMessage = "판매부진 제품분류를 삭제했습니다"; break;
        }
        System.out.println(successMessage);
        System.out.println("========");

    }

    public void printErrorMessage(String errorCode) {

        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.
        String errorMessage = "";
        switch (errorCode){
            case "selectCategoryList": errorMessage = "조회 결과가 없습니다"; break;
            case "registCategory": errorMessage = "신규 제품분류 등록에 실패했습니다."; break;
            case "modifyCategory": errorMessage = "제품분류명 변경에 실패했습니다"; break;
            case "deleteCategory": errorMessage = "제품분류 삭제에 실패했습니다"; break;
        }
        System.out.println(errorMessage);
        System.out.println("========");

    }

}
