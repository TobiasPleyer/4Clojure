;; Get the Caps - http://www.4clojure.com/problem/29
(fn get-caps [string]
  (let [uppers #{\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z}]
    (apply str (filter #(contains? uppers %) (seq string)))))
