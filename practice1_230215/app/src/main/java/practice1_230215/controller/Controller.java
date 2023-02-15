package practice1_230215.controller;

import practice1_230215.model.Model;
import practice1_230215.model.customer.Customer;
import practice1_230215.view.FailView;
import practice1_230215.view.SuccessView;

/* 브라우저 화면단에서
 * 1로 요청시 - 고객 한명 검색
 * 2로 요청시 - 고객 정보(크레딧) 수정
 * 
 */

 
 public class Controller {
     
     private static Model m = new Model(); // Controller 객체 생성없이도 사용 가능한 변수
     
     //Controller.reqRes(1);
     public void reqRes(int reqNo){
         if(reqNo==1) { // 고객 한명 검색
             // 정상 출력
             Model m = new Model();
             Customer c = m.select("id01");
             SuccessView.print(c);
         }else if(reqNo==2) { // 고객 정보(크레딧) 수정
             // 정상 출력
             //? update("id01", 30)
             Model m = new Model();
             boolean result = m.update("id01", 30);
             if(result==true) {
                 SuccessView.printMSG("고객 정보수정 성공");
             }else {
                 SuccessView.printMSG("고객 정보수정 실패");
             }
         }else {	
             // 비정상 출력
             FailView.print("GTFO");
         }
     }
 }
 