# Read from the file words.txt and output the word frequency list to stdout.
#ͨ��grep��-oѡ���ȫƥ������ʹ��ÿ�����ʷֱ����һ�У�
#Ȼ����uniq -cͳ�ƴ���������uniqͳ�ƴ����ǰ������ڵ���ͳ�ƴ�����
#����Ҫ�뽫grep�������sort��������uniq�����awk����λ�ü���
#!/bin/bash
cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2, $1 }'

#tr -s����Ŀ���ַ����ض��ַ�������ֻʣ��һ��ʵ�����������ո�

#sort��ʹ��ͬ���ַ����������Ա�uniq������ȫ��ȷ�ؼ�����ͬ���ַ�����

#uniq -c��uniq���ڹ��˵��������ظ��У�-c��ʾ����

#sort -r��-r��ʾ����������

#awk'{print $ 2��$ 1}'��