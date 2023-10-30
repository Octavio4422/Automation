let total2 = 0;

process.argv.map((v,i) => { if(i > 1) total2 += Number(v)});

console.log(total2)