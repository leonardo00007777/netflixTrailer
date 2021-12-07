package com.x62life.mo.model.customer;

import org.dom4j.tree.AbstractEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@Alias("nickname")*/
public class Nickname extends AbstractEntity implements Serializable {
/*@org.apache.ibatis.type.Alias("nickname")
public class Nickname extends AbstractEntity {*/
    private static final long serialVersionUID = -2184129492668323923L;

    private long nicknameId;
    private long customerId;
    private String nickname;

    public Nickname() {
        //Default Constructor
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (customerId ^ (customerId >>> 32));
        result = prime * result + (int) (nicknameId ^ (nicknameId >>> 32));
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Nickname other = (Nickname) obj;
        if (customerId != other.customerId) {
            return false;
        }
        if (nicknameId != other.nicknameId) {
            return false;
        }
        return true;
    }

    public long getNicknameId() {
        return nicknameId;
    }

    public void setNicknameId(long nicknameId) {
        this.nicknameId = nicknameId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public static List<Nickname> createList(String[] nicknames) {
        List<Nickname> nicknameList = new ArrayList<Nickname>();

        for (String nickname : nicknames) {
            Nickname nick = new Nickname();
            nick.setNickname(nickname);
            nicknameList.add(nick);
        }

        return nicknameList;
    }

}
