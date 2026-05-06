# CODEX.md

## 定位

`vibe-verse` 是本地根工作区，用来把后端和前端两个仓库放在一起协作。

```text
vibe-verse/
├─ vibe-verse-server/   # Spring Boot 后端仓库
└─ vibe-verse-web/      # React 前端仓库
```

根仓库本身不承载业务源码。

## 当前方向

- 后端：Spring Boot。
- 前端：React + TypeScript。
- 先做模块化单体，不急着拆微服务。

## 边界

- 根仓库只改 `README.md`、`AGENTS.md`、`CODEX.md`、`LOCAL.example.md`、`.gitignore` 等轻量文件。
- 后端代码进 `vibe-verse-server`。
- 前端代码进 `vibe-verse-web`。
- 团队协作细节口头约定，不在根仓库里写复杂流程。
