package org.example.Tushuguanlixitong;

/**
 * 父类  封装编号
 * @author 86150
 * @date 2024/1/10 16:28
 */
public class BaseEntity {
    private int id;  //编号

    public BaseEntity() {
    }

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }
}
