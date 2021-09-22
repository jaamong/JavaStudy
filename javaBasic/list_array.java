import java.util.ArrayList;
import java.util.Arrays;

public class list_array 
{
    public static void main(String[] args)
    {
        //배열 : inedx와 값으로 구성 -> index로 인한 빠른 검색
        //     : 크기 정의 후 변경 x 
        //     : 초기 정의된 크기만큼의 연속적인 메모리 공간 -> 관리 편리
        //     : 논리적 저장 순서 == 물리적 저장 순서
        //     : 데이터 삭제 후 빈 공간으로 남게되어 낭비 생김

        String arr1[] = new String[]{"a","b","c","d","e"};
        
        String arr2[] = new String[5];
        Arrays.fill(arr2, "a"); //import java.util.Arrays;

        for(String item : arr1)
            System.out.println(item);
        
        for (String item : arr2)
            System.out.println(item);
        
        String arr3[] = new String[5]; //filled with null
        for(String item : arr3)
            System.out.println(item);


        //리스트 : 동적인 크기 할당
        //       : 포인터가 다음 데이터의 순서를 가리키기 때문에 삽입, 삭제 빠름 (linked list)
        //       : 데이터 삭제 시, 포인터가 해당 메모리 공간을 가리키지 않으면 되므로 효율적 (linked ist)
        //       : 기본 타입 못 다음 (객체만 가능)
        //       : n번째 데이터 참조하려면 1-> 2-> ->.. -> n번째 처럼 순차적인 포인터 접근 (linked list)
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        
        for(String item : list1)
            System.out.println(item);
        
            //asList를 이용한 선언과 동시에 값 할당
        List<String> list2 = Arrays.asList(new String[]{"a","b","c"}); //array를 list에 할당
    }
}
