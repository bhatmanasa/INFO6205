package edu.neu.coe.info6205.sort.simple;

import edu.neu.coe.info6205.sort.*;
import edu.neu.coe.info6205.util.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//Please update n and arraySize value to run for different sizes and run times
//To update arraySize, we need to change int arraySize in the start of program and in every program
// I have added logic to divide the array elements to get desired array length of type required. Please check in each sort logic to update array size.
public class InsertionSortTimerTest {
    int n= 10;
    final int arraySize = 500;
    SortWithHelper<Integer> sorter = null;
    List<Integer> list = new ArrayList<>();
    Integer[] xs = null;

    @Test
    public void sort0() throws Exception {

        final Timer timer = new Timer();
        final int zzz = 20;
        final double mean= timer.repeat( n, () -> zzz, t -> {
            sorter.sort(xs);
            return null;
        }, t -> {
            list.clear();
            int i =10;
            while(i<100000){
                            /* If ArraySize 100 Make list.size() == 100 here.
                If ArraySize 200 Make list.size() == 200 here.
                If ArraySize 300 Make list.size() == 300 here.
                If ArraySize 400 Make list.size() == 400 here.
                If ArraySize 500 Make list.size() == 500 here.
                 */
                if(list.size() == 500){
                    break;
                }
                list.add(i);
                i=i+10;
            }

            final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
            Helper<Integer> helper = HelperFactory.create("InsertionSort", list.size(), config);
            helper.init(list.size());
            final PrivateMethodTester privateMethodTester = new PrivateMethodTester(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            sorter = new InsertionSort<Integer>(helper);
            xs = list.toArray(new Integer[0]);
            return t;
        }, t ->logger.trace("Sorting ORDERED ARRAY Complete!*"));

        System.out.println("\nSorting ORDERED ARRAY MeanTime="+mean+" ; ArraySize ="+arraySize+" ; n="+n);
    }


    @Test
    public void sort1() throws Exception {
        final Timer timer = new Timer();
        final int zzz = 20;
        final double mean = timer.repeat( n, () -> zzz, t -> {
            sorter.sort(xs);
            return null;
        }, t -> {
            list.clear();
            int i =100000;
                        /* If ArraySize 100 Make list.size() == 100 here.
                If ArraySize 200 Make list.size() == 200 here.
                If ArraySize 300 Make list.size() == 300 here.
                If ArraySize 400 Make list.size() == 400 here.
                If ArraySize 500 Make list.size() == 500 here.
                 */
            while(i>10){
                if(list.size() == 500){
                    break;
                }
                list.add(i);
                i=i-10;
            }

            final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
            Helper<Integer> helper = HelperFactory.create("InsertionSort", list.size(), config);
            helper.init(list.size());
            final PrivateMethodTester privateMethodTester = new PrivateMethodTester(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            sorter = new InsertionSort<Integer>(helper);
            xs = list.toArray(new Integer[0]);;
            return t;
        }, t -> logger.trace("Sorting REVERSE ORDERED Array COMPLETE!*"));

        System.out.println("Sorting REVERSE ORDERED ARRAY MeanTime="+mean+"; ArraySize ="+xs.length+" ; n="+n);



    }

    @Test
    public void sort2() throws Exception {
        final Timer timer = new Timer();
        final int zzz = 20;
        final double mean = timer.repeat( n, () -> zzz, t -> {
            sorter.sort(xs);
            return null;
        }, t -> {
            list.clear();
            int i =10;
            while(i<100000){
                /* If ArraySize 100 Make list.size() == 50 here.
                If ArraySize 200 Make list.size() == 125 here.
                If ArraySize 300 Make list.size() == 150 here.
                If ArraySize 400 Make list.size() == 250 here.
                If ArraySize 500 Make list.size() == 350 here.
                 */
                if(list.size() == 350){
                    break;
                }
                list.add(i);
                i=i+10;
            }
            i=119000;
            while(i>10){
                /* If ArraySize 100 Make list.size() == 75 here.
                If ArraySize 200 Make list.size() == 150 here.
                If ArraySize 300 Make list.size() == 250 here.
                If ArraySize 400 Make list.size() == 350 here.
                If ArraySize 500 Make list.size() == 450 here.
                 */
                if(list.size() == 450){
                    break;
                }
                list.add(i);
                i=i-10;
            }
            i=10;
            while(i<2000){
                /* If ArraySize 100 Make list.size() == 100 here.
                If ArraySize 200 Make list.size() == 200 here.
                If ArraySize 300 Make list.size() == 300 here.
                If ArraySize 400 Make list.size() == 400 here.
                If ArraySize 500 Make list.size() == 500 here.
                 */
                if(list.size() == 500){
                    break;
                }
                list.add(i);
                i=i+10;
            }

            final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
            Helper<Integer> helper = HelperFactory.create("InsertionSort", list.size(), config);
            helper.init(list.size());
            final PrivateMethodTester privateMethodTester = new PrivateMethodTester(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            sorter = new InsertionSort<Integer>(helper);
            xs = list.toArray(new Integer[0]);
            return t;
        }, t -> logger.trace("Sorting PARTIALLY ORDERED Array COMPLETE!*"));
        System.out.println("Sorting PARTIALLY ORDERED Array MeanTime="+mean+"; ArraySize ="+xs.length+" ; n="+n);

    }
    @Test
    public void sort3() throws Exception {
        final Timer timer = new Timer();
        final int zzz = 20;
        final double mean = timer.repeat( n, () -> zzz, t -> {
            sorter.sort(xs);
            return null;
        }, t -> {
            list.clear();
            int  i=101900;
            while(i>10){
               /* If ArraySize 100 Make list.size() == 50 here.
                If ArraySize 200 Make list.size() == 125 here.
                If ArraySize 300 Make list.size() == 150 here.
                If ArraySize 400 Make list.size() == 250 here.
                If ArraySize 500 Make list.size() == 350 here.
                 */
                if(list.size() == 350){
                    break;
                }
                list.add(i);
                i=i-10;
            }
            i =100;
            while(i<20000){
                               /* If ArraySize 100 Make list.size() == 75 here.
                If ArraySize 200 Make list.size() == 150 here.
                If ArraySize 300 Make list.size() == 250 here.
                If ArraySize 400 Make list.size() == 350 here.
                If ArraySize 500 Make list.size() == 450 here.
                 */
                if(list.size() == 450){
                    break;
                }
                list.add(i);
                i=i+10;
            }
            i=10;
            while(i<2000){
                            /* If ArraySize 100 Make list.size() == 100 here.
                If ArraySize 200 Make list.size() == 200 here.
                If ArraySize 300 Make list.size() == 300 here.
                If ArraySize 400 Make list.size() == 400 here.
                If ArraySize 500 Make list.size() == 500 here.
                 */
                if(list.size() == 500){
                    break;
                }
                list.add(i);
                i=i+10;
            }

            final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
            Helper<Integer> helper = HelperFactory.create("InsertionSort", list.size(), config);
            helper.init(list.size());
            final PrivateMethodTester privateMethodTester = new PrivateMethodTester(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            sorter = new InsertionSort<Integer>(helper);
            xs = list.toArray(new Integer[0]);
            return t;
        }, t -> logger.trace("Sorting RANDOM ORDERED Array COMPLETE!*"));
        System.out.println("Sorting RANDOM ARRAY MeanTime="+mean+"; ArraySize ="+xs.length+" ; n="+n);
    }


    final static LazyLogger logger = new LazyLogger(InsertionSort.class);


}
