

DB Used: PostgreSQL v14

```
create user random;
```

```
alter user scalerSchemaDesign_nov21 with encrypted password 'random';
```

```
create database random;
```

```
grant all privileges on database random to random;
```