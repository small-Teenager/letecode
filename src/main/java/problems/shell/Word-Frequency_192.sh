# Read from the file words.txt and output the word frequency list to stdout.
#通过grep的-o选项和全匹配正则使得每个单词分别输出一行，
#然后用uniq -c统计词数，由于uniq统计词数是按照相邻的行统计词数，
#所以要想将grep输出进行sort排序，最后把uniq输出用awk调换位置即可
#!/bin/bash
cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2, $1 }'

#tr -s：用目标字符串截断字符串，但只剩下一个实例（例如多个空格）

#sort：使相同的字符串连续，以便uniq可以完全正确地计算相同的字符串。

#uniq -c：uniq用于过滤掉连续的重复行，-c表示计数

#sort -r：-r表示按降序排序

#awk'{print $ 2，$ 1}'：