import java.util.*;

public class Baek7785_EnterLeave {
    public static void main(String[] args) {
        // 사원의 이름과 상태를 저장하는 HashMap 만들기
        HashMap<String, String> company = new HashMap<String, String>();

        // 사원 출입기록 수 n과 사원의 이름 및 상태를 입력 받는 기능 만들기
        // 이름과 상태를 입력 받고 그 값들을 HashMap에 저장
        // 이름을 ArrayList에 저장
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList namess = new ArrayList();
        ArrayList leaveEmployee = new ArrayList();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String status = sc.next();
            company.put(name, status);
            namess.add(name);
        }

        // ArrayList에 저장된 이름으로 HashMap에 저장된 직원의 출근 상황을 파악하여 아직 출근 중인 직원 구분
        for(int i = 0; i < n; i++){
            if(company.get(namess.get(i)).equals("leave")){

            }else{
                leaveEmployee.add(namess.get(i));
            }
        }

        Collections.sort(leaveEmployee);
        //Collections.sort(leaveEmployee, Comparator.reverseOrder());
        //Collections.reverse(leaveEmployee);
        //Collections.sort(leaveEmployee, String.CASE_INSENSITIVE_ORDER);



        for(int i = leaveEmployee.size()-1; i >=0; i--){
            System.out.println(leaveEmployee.get(i));
        }
    }
}
