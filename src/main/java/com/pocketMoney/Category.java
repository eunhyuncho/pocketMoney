package com.pocketMoney;

import java.util.List;

public class Category {
    private List<String> categories;

    //카테고리 전부 불러오기
    public List<String> getCategories() {
        return categories;
    }

    //카테고리 한개만 가져오기
    public String getCategory(){
        return null;
    }

    //카테고리 추가하기
    public void addCategory(String categoryName){
        categories.add(categoryName);
    }

    //카테고리 삭제하기
    public void deleteCategory(String categoryName){
        if(categories!=null){
            for(String category: categories){
                if(categoryName==category){
                    categories.remove(category);
                }
            }
        }else {
            System.out.println("카테고리가 비어있습니다.");
        }
    }
}
