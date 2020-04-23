package com.example.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * description: RunMain
 * date: 2020/2/26 16:57
 * author: hantao
 * version: 1.0
 */
public class RunMain {

    //构造成MenuDTO数据结构
    public static List<MenuDTO> getAllMenu(List<Menu> list) {
        List<MenuDTO> result = new ArrayList<>();
        for (Menu item : list) {
            MenuDTO menuDTO = new MenuDTO();
            menuDTO.setId(item.getId());
            menuDTO.setPid(item.getPid());
            menuDTO.setChildren(null);
            result.add(menuDTO);
        }
        return result;
    }
    /**
     * 作用:遍历树形菜单得到所有的id
     * @param root
     * @param result
     * @return
     */
    //前序遍历得到所有的id List
    private static List<Integer> ergodicList(List<MenuDTO> root, List<Integer> result){
        for (int i = 0; i < root.size(); i++) {
            // 查询某节点的子节点（获取的是list）
            result.add(root.get(i).getId());//前序遍历
            if (null != root.get(i).getChildren()) {
                List<MenuDTO> children = root.get(i).getChildren();
                ergodicList(children,result);
            }
            //result.add(root.get(i).getId());//后序遍历
        }
        return result;
    }


    public static  List<MenuDTO> ergodicTrees(List<MenuDTO> root) throws Exception {
        for (int i = 0; i < root.size(); i++) {
            // 查询某节点的子节点（获取的是list）
            List<MenuDTO> children = new ArrayList<MenuDTO>();
            if (null != root.get(i).getChildren()) {
                children = root.get(i).getChildren();
            }
            ergodicTrees(children);
        }
        return root;
    }
    /**
     *
     * @param list  MenuDTO数据
     * @param pid  父id
     * @return 把所有list  MenuDTO设置子节点
     * @throws Exception
     */
    public static List<MenuDTO> treeMenu(List<MenuDTO> list,Integer pid) throws Exception{
        List<MenuDTO> childList = new ArrayList<MenuDTO>();
        for (MenuDTO item : list) {
            if (item != null) {
                // 判断当前节点的父节点是否是pid
                if (pid.equals(item.getPid())) {
                    List<MenuDTO> child = treeMenu(list, item.getId());
                    item.setChildren(child);
                    childList.add(item);
                }
            }
        }
        return ergodicTrees(childList);
    }

    public static void main(String[] args) throws Exception {
        List<Menu> menus = new ArrayList<>();
        Menu menu1 = new Menu();
        menu1.setId(1);
        menu1.setPid(0);
        Menu menu2 = new Menu();
        menu2.setId(2);
        menu2.setPid(1);
        Menu menu3 = new Menu();
        menu3.setId(3);
        menu3.setPid(1);
        Menu menu4 = new Menu();
        menu4.setId(4);
        menu4.setPid(3);
        Menu menu5 = new Menu();
        menu5.setId(5);
        menu5.setPid(0);
        Menu menu6 = new Menu();
        menu6.setId(6);
        menu6.setPid(5);
        Menu menu7 = new Menu();
        menu7.setId(7);
        menu7.setPid(5);
        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);
        menus.add(menu5);
        menus.add(menu6);
        menus.add(menu7);
        List<MenuDTO> menuDTOs = getAllMenu(menus);
        List<MenuDTO> root = treeMenu(menuDTOs,0) ;  //pid=0
        //存放树形Integer类型的结果集
        List<Integer> result = new ArrayList<>();
        ergodicList(root,result);
        for (Integer item : result) {
            System.out.print(item +" ");  //前序遍历 1 2 3 4 5 6 7
        }
    }
}
