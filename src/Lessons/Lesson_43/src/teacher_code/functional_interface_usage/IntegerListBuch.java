package Lessons.Lesson_43.src.teacher_code.functional_interface_usage;


import java.util.List;

public class IntegerListBuch implements IBuch {

    @Override
    public int getBuch(Object t) {
        List<Integer> list = (List<Integer>) t;

        int result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;
    }
}
