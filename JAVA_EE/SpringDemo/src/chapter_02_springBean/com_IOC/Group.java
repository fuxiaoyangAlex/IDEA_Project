package chapter_02_springBean.com_IOC;


import java.util.List;

public class Group {
    private String theme;
    private List<Stu>list;
    public Group(){

    }
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Stu> getList() {
        return list;
    }

    public void setList(List<Stu> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Group{" +
                "theme='" + theme + '\'' +
                ", list=" + list +
                '}';
    }
}
