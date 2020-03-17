# kg_jalpaashara_2020
Kargo Coding Assessment

## Question
Determine whether a one-to-one character mapping exists from one string, s1, to another string,
s2.<br><br>
For example, given s1 = abc and s2 = bcd , print " true" into stdout since we can map each character in "abc" to a character in "bcd".<br>
Given s1 = foo and s2 = bar , print " false" since the character ‘o’ cannot map to two characters.<br>
But given s1 = bar and s2 = foo , print "true " since each character in "bar" can be mapped to a character in "foo".<br>

## Language used
Java

## Assumptions made

<ol>
  <li>When s1 and s2 are not of the same length there are characters without a mapping and hence returning false in that case.<br>
  For example, <br>Case 1: s1 = bar & s2 = fo, r in s1 doesn't have any valid mapping in s2.<br>
  Case 2: s1 = fo & s2 = bar, s2 has an extra character but I am not sure what to consider in this case. If this were to be a valid scenerio I have explained the necessary changes required in the code in the [Possible Valid Scenerio](#possible-valid-scenerio) section below.</li>
  <li>A character in s1 can be mapped with the same character in s2. For example, if s1 = mom & s2 = pop this will return true.</li>
  <li>From the example in the question: given s1 = bar and s2 = foo , print "true ", assuming that multiple characters in s1 can be mapped to the same character in s2 (a->o & r->o).</li>
</ol>

## Possible Valid Scenerio
s1 has fewer characters than s1. Exaple: s1 = fo & s2 = bar.<br>
The required changes in the code are shown below:

<pre>
  <code>
    if(s1.length()>s2.length() || (s1.length()==0 && s2.length()==0)) {
      return false;
    }
  </code>
</pre>
