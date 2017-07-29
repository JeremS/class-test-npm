(ns cljs-tests-npm.core-web
  (:require
    ["@material/textfield/foundation" :as textf]))

(enable-console-print!)


(def foundation textf/MDCCheckboxFoundation)


(def foundation-instance (new foundation (.defaultAdapter foundation)))

(defn -main [& args]
  (println foundation-instance))