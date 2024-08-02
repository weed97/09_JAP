package com.ohgiraffers.section06.join;

import com.ohgiraffers.section03.projection.BiDirectionMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name ="category_section06")
@Table(name = "tbl_category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name ="ref_category_code")
    private Integer refCategoryCode;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Menu> menuList;

    // 순환 참조 방지

    @Override
    public String toString() {
        return "BiDirectionCategory{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
