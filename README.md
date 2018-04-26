This repo is a reproduction of an issue when ClojureScript compiler doesn't use sourcemaps with `:optimizations` option is set to `:simple`.

**_Update:_** Thanks to [@pesterhazy](https://github.com/pesterhazy) for solving the issue in this [pull request](https://github.com/mkarp/cljs-sourcemap-demo/pull/1). Paulus also showed that the issue doesn't happen when using cljs.main in [another pull request](https://github.com/mkarp/cljs-sourcemap-demo/pull/2).

### Steps to reproduce

Run the following command. It will build the `*.cljs` file without the optimizations:

```
lein dev && node compiled/first.js
```

This will produce a stacktrace mentioning the `*.cljs` files (full output can be seen at [output-dev.txt](output-dev.txt)):

```
[object Object]
    at Function.demo$first$_main (.../compiled/first.out/demo/first.cljs:4:11)
    ...
```

Then run the same command with optimizations enabled:

```
lein prod && node compiled/first.js
```

This will produce a stacktrace not mentioning the `*.cljs` files  (full output can be seen at [output-prod.txt](output-prod.txt)):

```
Trace
    at Function.demo.first._main (.../compiled/first.js:2084:353)
    ...
```
