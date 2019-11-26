package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

import java.util.*;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author Kings
 * @version V1.0
 * @date 2019.11.26
 */
@Data
public class ListTypeVo {
    /**
     * List
     */
    private List list;
    /**
     * List 1
     */
    private List <Dog> list1;
    /**
     * List 2
     */
    private ArrayList<String> list2;
    /**
     * List 3
     */
    private LinkedList<String> list3;

    /**
     * Map
     */
    private Map map;
    /**
     * Map 1
     */
    private Map<String, Object> map1;
    /**
     * Map 2
     */
    private HashMap<String, Integer> map2;
    /**
     * Map 3
     */
    private LinkedHashMap<Integer, Date> map3;
    /**
     * Map 4
     */
    private TreeMap<Integer, Integer> map4;
    /**
     * Map 5
     */
    private SortedMap<Integer, Integer> map5;
    /**
     * Map 6
     */
    private Hashtable<Integer, String> map6;

    /**
     * Set
     */
    private Set set;
    /**
     * Set 1
     */
    private Set<Dog> set1;

    /**
     * Set 2
     */
    private Set set2;

}


