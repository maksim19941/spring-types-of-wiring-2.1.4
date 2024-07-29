package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {

    @Autowired
    private Wood3 wood;

    @Autowired
    public void setWood(Wood3 wood) {
        this.wood = wood;
    }

    @Autowired
    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
