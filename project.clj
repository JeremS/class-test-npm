(defproject cljs-tests-npm "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.856"]]

  :source-paths ["src" "scripts"]

  :plugins [[lein-cljsbuild "1.1.6"]]

  :clean-targets ^{:protect false} ["resources/public/js/"
                                    "node_modules"
                                    "target"]

  :cljsbuild {:builds [{:id           "dev"
                        :source-paths ["src"]
                        :compiler     {:main "cljs-tests-npm.core"
                                       :asset-path "js/out"
                                       :output-to "resources/public/js/main.js"
                                       :output-dir "resources/public/js/out"
                                       :parallel-build true
                                       :verbose true
                                       :optimizations :none
                                       :language-in :ecmascript6
                                       :npm-deps {:material-components-web "0.15.0"}
                                       :install-deps true}}]})


