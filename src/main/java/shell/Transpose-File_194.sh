# Read from the file file.txt and print its transposed content to stdout.
declare -a result
while read p; do
	i=0
	for w in $p; do
		if [ "x${result[$i]}" != "x" ]; then
			result[$i]+=" "
		fi
		result[$i]+=$w
		i=$(($i+1))
	done
done < file.txt

for l in "${result[@]}"; do
	echo "$l"
done