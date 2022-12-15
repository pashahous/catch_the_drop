package mysolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* На вход поступает отсортированный массив чисел, пройтись по массиву , убрать все повторяющиеся числа и верунуть массив без
* повторений. Задачу
* решить без использования дополнительного массива.
* */
public class CkeckArray1 {
    public static void main(String[] args) {
        List<Integer> inpList = new ArrayList<>(Arrays.asList(0,0,0,1,1,2,2,2,3,3,3,4,4,5,5,5,6));
        System.out.println(CheckArray.check(inpList));

    }
}

class CheckArray{

    public static List<Integer> check (List inpArray){
        int firstPointer = 0; // начальный и конечный указатели
        int secondPointer = 0;
        int lenghtArray = inpArray.size();
        //пока второй указатель меньше количества элементов в массиве
        while (secondPointer < lenghtArray){
            //тут проверяем, что
            while (secondPointer < lenghtArray -1 && inpArray.get(secondPointer) == inpArray.get(secondPointer +1)){
                secondPointer +=1;
            }
            inpArray.set(firstPointer,inpArray.get(secondPointer));
            secondPointer +=1;
            firstPointer +=1;


        }


        return inpArray.subList(0,firstPointer);
    }


}
