import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    public void getData(){
        System.out.println("Sách giáo khoa:");
        List<SachGiaoKhoa> list;
        try{
            FileReader reader = new FileReader("MOCK_DATA (1).json");
            //chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<SachGiaoKhoa>>(){}.getType();
            list = new Gson().fromJson(reader, objectType);
            for (SachGiaoKhoa sachGiaoKhoa : list) {
                System.out.println(sachGiaoKhoa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Đồ án:");
        List<DoAn> list2;
        try{
            FileReader reader = new FileReader("MOCK_DATA (2).json");
            //chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<DoAn>>(){}.getType();
            list2 = new Gson().fromJson(reader, objectType);
            for (DoAn doan : list2) {
                System.out.println(doan);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Tài liệu điện tử:");
        List<TaiLieuDienTu> list3;
        try{
            FileReader reader = new FileReader("MOCK_DATA (3).json");
            //chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<TaiLieuDienTu>>(){}.getType();
            list3 = new Gson().fromJson(reader, objectType);
            for (TaiLieuDienTu tailieudentu : list3) {
                System.out.println(tailieudentu);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}