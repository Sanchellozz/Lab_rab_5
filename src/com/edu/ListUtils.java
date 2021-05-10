package com.edu;

public class ListUtils
{
    public static ListElement insert(ListElement first, int value) {
        ListElement p = new ListElement(value);
        p.setNext(first);
        return p;
    }


    public static ListElement filter(ListElement first)
    {
        ListElement p = null;
        while (first != null)
        {
            if (first.getValue()%2 != 0) p = insert(p, first.getValue());
            first = first.getNext();
        }
        return p;
    }
    public static ListElement map(ListElement first)
    {
        ListElement p = null;
        while (first != null)
        {
            int value = first.getValue();
            p = insert(p, value*value);
            first = first.getNext();
        }
        return p;
    }
    public static void reduce(ListElement first, int value)
    {
        if (first != null)
        {
            if (first.getValue() % 3 == 0) {
                value = value * first.getValue();
            }
            first = first.getNext();
            reduce(first, value);
        }
        else
        {
            System.out.print("Результат = " + (value));
        }
    }

}