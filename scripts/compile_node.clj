(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main           "cljs-tests-npm.core-node"
   :output-to      "target/main.js"
   :output-dir     "target/out"
   :parallel-build true
   :verbose        true
   :pretty-print   true
   :optimizations  :none
   :language-in    :ecmascript6
   :language-out   :ecmascript3
   :npm-deps       {:material-components-web "0.15.0"}
   :target         :nodejs})