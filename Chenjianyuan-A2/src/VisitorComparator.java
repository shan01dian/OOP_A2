import java.util.Comparator;
public class VisitorComparator implements Comparator<Visitor>{
    @Override
    public int compare(Visitor v1, Visitor v2) {//按访问日期排序
        int dateComparison = v1.getVisitDate().compareTo(v2.getVisitDate());
        if(dateComparison != 0){
            return dateComparison;//如果日期不同按照日期排序
        }
        return v1.toString().compareTo(v2.toString());//日期相同按照成人儿童排序
    }
}
