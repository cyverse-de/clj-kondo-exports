(defproject org.cyverse/clj-kondo-exports "0.1.1-SNAPSHOT"
  :description "clj-kondo configuration and macro expansons for third-party libraries"
  :license {:name "BSD"
            :url "https://cyverse.org/license"}
  :dependencies [[org.clojure/clojure "1.12.5"]
                 [korma "0.4.3"]]
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2026.08.04"]]
  :repl-options {:init-ns clj-kondo-exports.core})
